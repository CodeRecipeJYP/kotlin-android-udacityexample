package com.udacity.notepad.recycler

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by jaeyoung on 22/01/2018.
 */

val Context.layoutInflator get() = LayoutInflater.from(this)