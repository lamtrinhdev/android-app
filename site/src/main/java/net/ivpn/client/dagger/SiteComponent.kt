package net.ivpn.client.dagger

/*
 IVPN Android app
 https://github.com/ivpn/android-app

 Created by Oleksandr Mykhailenko.
 Copyright (c) 2023 IVPN Limited.

 This file is part of the IVPN Android app.

 The IVPN Android app is free software: you can redistribute it and/or
 modify it under the terms of the GNU General Public License as published by the Free
 Software Foundation, either version 3 of the License, or (at your option) any later version.

 The IVPN Android app is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details.

 You should have received a copy of the GNU General Public License
 along with the IVPN Android app. If not, see <https://www.gnu.org/licenses/>.
*/

import dagger.Component
import net.ivpn.client.SiteIVPNApplication
import net.ivpn.client.updates.UpdatesFragment
import net.ivpn.client.updates.UpdatesJobService
import net.ivpn.core.common.dagger.ApplicationComponent

@SiteScope
@Component(dependencies = [ApplicationComponent::class])
interface SiteComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: ApplicationComponent): SiteComponent
    }

    fun inject(application: SiteIVPNApplication)

    fun inject(fragment: UpdatesFragment)

    fun inject(service: UpdatesJobService)
}