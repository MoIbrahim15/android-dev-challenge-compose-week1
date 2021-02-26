/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screens.details

import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.screens.base.BaseActivity
import com.example.androiddevchallenge.ui.screens.main.PUPPY_DETAILS
import com.example.androiddevchallenge.ui.theme.lightGray
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.picasso.PicassoImage

class PuppyDetailsActivity : BaseActivity() {

    private var puppy: Puppy? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        puppy = intent.getParcelableExtra(PUPPY_DETAILS)
    }

    @Composable
    override fun ActivityContent() {
        PuppiesInfo(puppy)
    }

    override fun toolbarTitle(): String {
        return puppy?.name ?: ""
    }
}

@Composable
fun PuppiesInfo(puppy: Puppy?) {
    Column(
        modifier = Modifier.background(lightGray).verticalScroll(rememberScrollState())
    ) {

        PicassoImage(
            data = puppy?.imageURL ?: "",
            loading = {
                Box(Modifier.matchParentSize()) {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center),
                        color = Color.Black
                    )
                }
            },
            contentDescription = stringResource(id = R.string.puppy_image),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth().height(250.dp)
        )
        Text(
            text = puppy?.description ?: "",
            color = Color.Black,
            style = typography.body1,
            modifier = Modifier.padding(16.dp)
        )
    }
}
