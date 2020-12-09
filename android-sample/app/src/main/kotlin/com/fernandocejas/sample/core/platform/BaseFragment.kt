/**
 * Copyright (C) 2020 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fernandocejas.sample.core.platform

import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.fernandocejas.sample.core.extension.inputManager

abstract class BaseFragment(layoutId: Int) : Fragment(layoutId) {
    val actionBar = activity?.actionBar

    fun hideKeyboard(view: View) =
        view.let { context?.inputManager?.hideSoftInputFromWindow(it.windowToken, 0) }

    fun toast(message: String) =
        Toast.makeText(activity, message.trim(), Toast.LENGTH_SHORT).show()
}

