package br.com.map.topiteste

import android.app.Application
import br.com.map.topiteste.data.di.DataModule
import br.com.map.topiteste.domain.di.DomainModule
import br.com.map.topiteste.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
        DomainModule.load()
        PresentationModule.load()

    }
}