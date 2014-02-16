package com.winelandsoft.jeroglificos;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("NewApi")
public class ListDrawerAdapter extends BaseAdapter {

	private Context _context;
	private LayoutInflater _inflater;
	private ArrayList<ListDrawerItem> _items = new ArrayList<ListDrawerItem>();

	public ListDrawerAdapter(Context context, ArrayList<ListDrawerItem> items) {
		this._context = context;
		this._inflater = LayoutInflater.from(_context);
		this._items = items;
	}


	@Override
	public boolean hasStableIds() {
		return false;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return _items.size();
	}

	@Override
	public ListDrawerItem getItem(int itemPosition) {
		return ((ListDrawerItem) this._items.get(itemPosition));
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public View getView(int itemPosition, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub

		final ListDrawerItem item = (ListDrawerItem) getItem(itemPosition);
		ViewHolder_item holderItem;

		if (view == null) {
			view = _inflater.inflate(R.layout.left_drawer_item, null);

			holderItem = new ViewHolder_item();
			
			holderItem.itemLabel = (TextView) view.findViewById(R.id.itemLabel);
			holderItem.itemIcon = (ImageView) view.findViewById(R.id.itemIcon);
			
			view.setTag(holderItem);	
			
			
		}
		else {
			holderItem = (ViewHolder_item) view.getTag();
		}

		
		holderItem.itemLabel.setText(item.title);
		holderItem.itemIcon.setImageResource(item.icon);
		

		//LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(_context, R.anim.list_layout_controller);
		//holderItem.itemLayout.setLayoutAnimation(controller);

		return view;

	}

	static class ViewHolder_item {

		public TextView itemLabel;
		public ImageView itemIcon;
	}



}