package com.lkb.basemvp.repo

import com.lkb.basemvp.AppPreference
import com.lkb.basemvp.Repository
import javax.inject.Inject

class SplashRepository @Inject constructor(appPref: AppPreference) : Repository(appPref) {
}