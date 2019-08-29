package com.obvious.nasa.injection.component


import com.obvious.nasa.injection.PerActivity
import com.obvious.nasa.injection.base.BaseActivity
import com.obvious.nasa.injection.module.ActivityModule

import dagger.Subcomponent




/*The below contains all the activity level components*/
@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)




}

