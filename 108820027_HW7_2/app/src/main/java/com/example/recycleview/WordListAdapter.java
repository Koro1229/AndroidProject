package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LinkedList<String> mTitleList;
    private final LinkedList<String> mContentList;
    private LayoutInflater mInflater;
    private MainActivity MainActivity;

    public WordListAdapter(MainActivity mainActivity,Context context, LinkedList<String> titleList, LinkedList<String> contentList) {
            mInflater = LayoutInflater.from(context);
        this.mTitleList = titleList;
        this.mContentList = contentList;
        this.MainActivity = mainActivity;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mTitle = mTitleList.get(position);
        holder.wordItemView.setText(mTitle);
        String mContent = mContentList.get(position);
        holder.wordContentView.setText(mContent);
    }

    @Override
    public int getItemCount() {
        return mTitleList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        public final TextView wordItemView;
        public final TextView wordContentView;
        final WordListAdapter mAdapter;


        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word_title);
            wordContentView = itemView.findViewById(R.id.word_content);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            String element = mTitleList.get(mPosition);

            Intent intent = new Intent(MainActivity, RecipeActivity.class);
            intent.putExtra(MainActivity.EXTRA_TITLE, element);
            MainActivity.StartIntent(intent);
            mAdapter.notifyDataSetChanged();
        }
    }

}


