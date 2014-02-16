package com.winelandsoft.jeroglificos;

import java.util.ArrayList;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class ListChallengesAdapter extends BaseAdapter {

	private Context _context;
	private LayoutInflater _inflater;
	private ArrayList<Challenge> _challenges = new ArrayList<Challenge>();
	//private ImageLoader imageLoader;

	public ListChallengesAdapter(Context context, ArrayList<Challenge> challenges) {
		this._context = context;
		this._inflater = LayoutInflater.from(_context);
		this._challenges = challenges;

		//this.imageLoader = new ImageLoader(MainActivity.requestQueue, new BitmapLRUCache()); 
	}


	@Override
	public boolean hasStableIds() {
		return false;
	}


	@Override
	public int getCount() {
		return _challenges.size();
	}

	@Override
	public Challenge getItem(int itemPosition) {
		return ((Challenge) this._challenges.get(itemPosition));
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}


	@Override
	public View getView(int itemPosition, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub

		final Challenge challenge = (Challenge) getItem(itemPosition);
		ViewHolder_challenge holderChallenge;

		if (view == null) {
			view = _inflater.inflate(R.layout.list_challenge, null);

			holderChallenge = new ViewHolder_challenge();

			holderChallenge.challengeLayout = (LinearLayout) view.findViewById(R.id.challengeLayout);
			holderChallenge.challengeTitle = (TextView) view.findViewById(R.id.challengeTitle);
			//holderChallenge.challengeImage = (NetworkImageView) view.findViewById(R.id.challengeImage);
			holderChallenge.challengeImage = (ImageView) view.findViewById(R.id.challengeImage);
			//holderChallenge.challengeFavorite = (ImageView) view.findViewById(R.id.challengeFavorite);
			//holderChallenge.challengeImage.setImageResource(R.drawable.jeroglificos_test);

			view.setTag(holderChallenge);	


		}
		else {
			holderChallenge = (ViewHolder_challenge) view.getTag();
		}


		holderChallenge.challengeTitle.setText(challenge.getTitle());
		if (itemPosition%2==0){
			holderChallenge.challengeImage.setImageResource(R.drawable.jeroglificos_test);
		}else{
			holderChallenge.challengeImage.setImageResource(R.drawable.jeroglificos_test2);
		}

		//if(challenge.isFavorite()){
		//holderChallenge.challengeFavorite.setImageResource(R.drawable.ic_rating_favorite);
		//}



		//LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(_context, R.anim.list_layout_controller);
		//holderChallenge.challengeLayout.setLayoutAnimation(controller);

		return view;

	}

	static class ViewHolder_challenge {

		public LinearLayout challengeLayout;
		//public NetworkImageView challengeImage;
		public ImageView challengeImage;		
		public TextView challengeTitle;
		//public ImageView challengeFavorite;

	}



}