/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package <%= appPackage %>.ui.feed.blogs;

import android.databinding.ObservableField;

import <%= appPackage %>.data.model.api.BlogResponse;

/**
 * Created by amitshekhar on 10/07/17.
 */

public class BlogItemViewModel {

    private BlogResponse.Blog mBlog;
    public ObservableField<String> imageUrl;
    public ObservableField<String> title;
    public ObservableField<String> author;
    public ObservableField<String> date;
    public ObservableField<String> content;

    public BlogItemViewModelListener mListener;

    public BlogItemViewModel(BlogResponse.Blog blog, BlogItemViewModelListener listener) {
        this.mBlog = blog;
        this.mListener = listener;
        imageUrl = new ObservableField<>(mBlog.getCoverImgUrl());
        title = new ObservableField<>(mBlog.getTitle());
        author = new ObservableField<>(mBlog.getAuthor());
        date = new ObservableField<>(mBlog.getDate());
        content = new ObservableField<>(mBlog.getDescription());
    }

    public void onItemClick() {
        mListener.onItemClick(mBlog.getBlogUrl());
    }

    public interface BlogItemViewModelListener {
        void onItemClick(String blogUrl);
    }
}
