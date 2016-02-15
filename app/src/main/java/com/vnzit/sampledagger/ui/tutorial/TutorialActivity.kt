package com.vnzit.sampledagger.ui.tutorial

import android.os.Bundle
import android.widget.TextView
import com.vnzit.sampledagger.R
import com.vnzit.sampledagger.di.DaggerUserComponent
import com.vnzit.sampledagger.di.UserComponent
import com.vnzit.sampledagger.di.UserModule
import com.vnzit.sampledagger.ui.base.BaseActivity
import javax.inject.Inject

class TutorialActivity : BaseActivity<UserComponent>() {

    @Inject lateinit  var presenter: TutorialPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvContent = findViewById(R.id.tvContent) as TextView
        component.inject(this)
        tvContent.text = presenter.api.toString();

    }

    override fun initializeInjector(): UserComponent {
        return DaggerUserComponent.builder().appComponent(appComponent).activityModule(activityModule).userModule(UserModule()).build()
    }
}
