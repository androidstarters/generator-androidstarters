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

package <%= appPackage %>.di.builder;

import <%= appPackage %>.ui.about.AboutFragmentProvider;
import <%= appPackage %>.ui.feed.FeedActivity;
import <%= appPackage %>.ui.feed.FeedActivityModule;
import <%= appPackage %>.ui.feed.blogs.BlogFragmentProvider;
import <%= appPackage %>.ui.feed.opensource.OpenSourceFragmentProvider;
import <%= appPackage %>.ui.login.LoginActivity;
import <%= appPackage %>.ui.login.LoginActivityModule;
import <%= appPackage %>.ui.main.MainActivity;
import <%= appPackage %>.ui.main.MainActivityModule;
import <%= appPackage %>.ui.main.rating.RateUsDialogProvider;
import <%= appPackage %>.ui.splash.SplashActivity;
import <%= appPackage %>.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = {MainActivityModule.class,
            AboutFragmentProvider.class, RateUsDialogProvider.class})
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {FeedActivityModule.class,
            BlogFragmentProvider.class, OpenSourceFragmentProvider.class})
    abstract FeedActivity bindFeedActivity();

}
