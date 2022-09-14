package com.lkb.basemvp

import javax.inject.Inject

class SplashRepository @Inject constructor(appPref: AppPreference) : Repository(appPref) {
}