package com.winelandsoft.jeroglificos;

import java.util.ArrayList;

import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnItemClickListener  {

	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle drawerToggle;
	public ListView left_drawer;
	public ListDrawerAdapter listViewAdapter;
	ArrayList<ListDrawerItem> items = new ArrayList<ListDrawerItem>();
	GestureOverlayView gestureView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawerToggle = new ActionBarDrawerToggle(
				this,
				drawerLayout,
				R.drawable.ic_drawer,
				R.string.drawer_open,
				R.string.drawer_close
				) {

			public void onDrawerClosed(View view) {
				ActivityCompat.invalidateOptionsMenu(MainActivity.this);
				//invalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				ActivityCompat.invalidateOptionsMenu(MainActivity.this);
				//invalidateOptionsMenu();
			}
		};
		drawerLayout.setDrawerListener(drawerToggle);  
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		
				
		left_drawer = (ListView) findViewById(R.id.left_drawer);
						
		ListDrawerItem i1 = new ListDrawerItem();
		i1.id = "optionNuevo";
		i1.title = "Nuevo";
		i1.icon = R.drawable.ic_brain_new;
		
		ListDrawerItem i2 = new ListDrawerItem();
		i2.id = "optionGrabar";
		i2.title = "Favoritos";
		i2.icon = R.drawable.ic_rating_favorite;
		
		ListDrawerItem i3 = new ListDrawerItem();
		i3.id = "optionCompartir";
		i3.title = "Pendientes";
		i3.icon = R.drawable.ic_time;
		
		ListDrawerItem i4 = new ListDrawerItem();
		i4.id = "optionColor";
		i4.title = "Resueltos";
		i4.icon = R.drawable.ic_navigation_accept;
		
		
		items.add(i1);
		items.add(i2);
		items.add(i3);
		items.add(i4);

		
		listViewAdapter = new ListDrawerAdapter(this, items);
		left_drawer.setAdapter(listViewAdapter);
		
		listViewAdapter.notifyDataSetChanged();
		
		left_drawer.setOnItemClickListener(this);

		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {

			if (drawerLayout.isDrawerOpen(left_drawer)) {
				drawerLayout.closeDrawer(left_drawer);
			} else {
				drawerLayout.openDrawer(left_drawer);
			}
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
	
	public void showOptions(View view) {
		if (drawerLayout.isDrawerOpen(left_drawer)) {
			drawerLayout.closeDrawer(left_drawer);
		} else {
			drawerLayout.openDrawer(left_drawer);
		}return;
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		
		drawerLayout.closeDrawer(left_drawer); 
		
		final ListDrawerItem optionSelected = items.get(position);
		
		Toast.makeText(parent.getContext(),optionSelected.id,Toast.LENGTH_SHORT).show();
		
		
	}
	
	
	

}
