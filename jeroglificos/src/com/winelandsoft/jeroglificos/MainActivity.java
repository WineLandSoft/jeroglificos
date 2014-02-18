package com.winelandsoft.jeroglificos;

import java.util.ArrayList;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnItemClickListener  {

	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle drawerToggle;
	public ListView leftDrawerList;
	public ListDrawerAdapter listDrawerAdapter;
	ArrayList<ListDrawerItem> leftDrawerItems = new ArrayList<ListDrawerItem>();
	
	ArrayList<Challenge> challenges = new ArrayList<Challenge>();
	
	public GridView gridViewChallenges;
	public ListChallengesAdapter listChallengesAdapter;

	
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
		
				
		leftDrawerList = (ListView) findViewById(R.id.leftDrawerList);
						
		ListDrawerItem i1 = new ListDrawerItem();
		i1.id = "optionNuevo";
		i1.title = "Nuevo";
		i1.icon = R.drawable.ic_brain_new;
		
		ListDrawerItem i2 = new ListDrawerItem();
		i2.id = "optionGrabar";
		i2.title = "Favoritos";
		i2.icon = R.drawable.ic_favorite;
		
		ListDrawerItem i3 = new ListDrawerItem();
		i3.id = "optionCompartir";
		i3.title = "Pendientes";
		i3.icon = R.drawable.ic_time;
		
		ListDrawerItem i4 = new ListDrawerItem();
		i4.id = "optionColor";
		i4.title = "Resueltos";
		i4.icon = R.drawable.ic_navigation_accept;
		
		
		leftDrawerItems.add(i1);
		leftDrawerItems.add(i2);
		leftDrawerItems.add(i3);
		leftDrawerItems.add(i4);

		
		listDrawerAdapter = new ListDrawerAdapter(this, leftDrawerItems);
		leftDrawerList.setAdapter(listDrawerAdapter);
		
		listDrawerAdapter.notifyDataSetChanged();
		
		leftDrawerList.setOnItemClickListener(this);

		Challenge ch1 = new Challenge();
		ch1.setId("1");
		ch1.setTitle("País Caribeño");
		ch1.setFavorite(true);
		ch1.setNumDone(2231);
		ch1.setNumLike(998);
		//ch1.setImageSrc(imageSrc)		
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);
		challenges.add(ch1);

		
		
		
		
		gridViewChallenges = (GridView) findViewById(R.id.gridViewChallenges);
		listChallengesAdapter = new ListChallengesAdapter(this, challenges);
		gridViewChallenges.setAdapter(listChallengesAdapter);



		/*gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), ItemListadoFragment.class);
				intent.putExtra("items", leftDrawerItems);
				startActivity(intent);
			}
		});*/

		
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		drawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {

			if (drawerLayout.isDrawerOpen(leftDrawerList)) {
				drawerLayout.closeDrawer(leftDrawerList);
			} else {
				drawerLayout.openDrawer(leftDrawerList);
			}
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
	
	public void showOptions(View view) {
		if (drawerLayout.isDrawerOpen(leftDrawerList)) {
			drawerLayout.closeDrawer(leftDrawerList);
		} else {
			drawerLayout.openDrawer(leftDrawerList);
		}return;
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		
		drawerLayout.closeDrawer(leftDrawerList); 
		
		final ListDrawerItem optionSelected = leftDrawerItems.get(position);
		
		Toast.makeText(parent.getContext(),optionSelected.id,Toast.LENGTH_SHORT).show();
		
		
	}
	
	
	

}
