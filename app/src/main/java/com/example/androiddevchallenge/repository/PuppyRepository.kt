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
package com.example.androiddevchallenge.repository

import android.content.Context
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy

class PuppyRepository {

    fun getPuppies(context: Context): MutableList<Puppy> {
        val puppies = mutableListOf<Puppy>()
        puppies.add(
            Puppy(
                0,
                "Abe",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1571999001321-f54197a02cc8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=3300&q=80"
            )
        )
        puppies.add(
            Puppy(
                1,
                "Ace",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1608831540955-35094d48694a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=3024&q=80"
            )
        )
        puppies.add(
            Puppy(
                2,
                "Aero",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1610244130620-fd348aa7854e?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                3,
                "Bailey",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80"
            )
        )
        puppies.add(
            Puppy(
                4,
                "Betty",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1583512603805-3cc6b41f3edb?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1400&q=80"
            )
        )
        puppies.add(
            Puppy(
                5,
                "Biscuit",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1561037404-61cd46aa615b?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                6,
                "Benny",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1300&q=80"
            )
        )
        puppies.add(
            Puppy(
                7,
                "Billy",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1583511666372-62fc211f8377?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=935&q=80"
            )
        )
        puppies.add(
            Puppy(
                8,
                "Bingo",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1598133894008-61f7fdb8cc3a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=934&q=80"
            )
        )
        puppies.add(
            Puppy(
                9,
                "Blaze",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1537151608828-ea2b11777ee8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=939&q=80"
            )
        )
        puppies.add(
            Puppy(
                10,
                "Buffy",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1566903451935-7e8835ed3e97?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                11,
                "Brownie",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1591856419156-3979c9edd30f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80"
            )
        )
        puppies.add(
            Puppy(
                12,
                "Carmen",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1592404395264-7948316534bd?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                13,
                "Buddy",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1610635064598-cb0adf672748?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                14,
                "Buster",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1612555788151-a6b40429d7e9?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=934&q=80"
            )
        )
        puppies.add(
            Puppy(
                15,
                "Captain",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1587559045816-8b0a54d1fbd2?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80"
            )
        )
        puppies.add(
            Puppy(
                16,
                "Chico",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1553882808-5b5ac967ce5f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=2098&q=80"
            )
        )
        puppies.add(
            Puppy(
                17,
                "Dexter",
                context.getString(R.string.puppy_desc),
                "https://images.unsplash.com/photo-1613928521908-24ccf17a1707?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=975&q=80"
            )
        )
        return puppies
    }
}
