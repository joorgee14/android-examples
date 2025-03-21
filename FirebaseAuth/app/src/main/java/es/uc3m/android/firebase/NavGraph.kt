/*
 * (C) Copyright 2025 Boni Garcia (https://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package es.uc3m.android.firebase

const val LOGIN_ROUTE = "login"
const val SIGNUP_ROUTE = "signup"
const val HOME_ROUTE = "home"

sealed class NavGraph(val route: String) {
    data object Login : NavGraph(LOGIN_ROUTE)
    data object Signup : NavGraph(SIGNUP_ROUTE)
    data object Home : NavGraph(HOME_ROUTE)
}