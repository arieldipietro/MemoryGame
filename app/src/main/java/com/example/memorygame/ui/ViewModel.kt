package com.example.memorygame.ui

import android.app.Application
import android.media.Image
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.memorygame.R
import java.util.*
import kotlin.random.Random
import kotlin.system.measureNanoTime

enum class DifficultyLevel{
    EASY,
    MEDIUM,
    HARD
}

class ViewModel(application : Application) : AndroidViewModel(application) {

    var easyImagesListFinal = mutableListOf<Int>()

    private val imagesList = listOf<Int>(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
        R.drawable.img14,
        R.drawable.img15
    )


    fun getEasyRandomImagesList(): MutableList<Int> {
        val easyImagesList = mutableListOf<Int>()
        for (item in 0..7) {
            easyImagesList.add(item, imagesList[item])
            easyImagesList.add(item, imagesList[item])
        }

            var count = 0

            if (count < 16) {
                for (item in 0..count) {

                    val random = easyImagesList.random()
                    Log.i("MainActivity", "random= ${random}")
                    if (easyImagesListFinal.contains(random)) {
                        val repeated = easyImagesListFinal.count { it == random }
                        Log.i("MainActivity", "repeated: $repeated")
                        if (repeated < 2) {
                            easyImagesListFinal.add(item, random)
                            count = easyImagesListFinal.size
                            Log.i("MainActivity", "${easyImagesListFinal}")
                            Log.i("MainActivity", "count: $count")
                            //continue
                        } else {
                            count = easyImagesListFinal.size
                            //continue
                        }
                        /*Log.i("MainActivity", "return")
                    count = easyImagesListFinal.size
                    Log.i("MainActivity", "count: $count")
                    continue*/
                    } else {
                        easyImagesListFinal.add(item, random)
                        count = easyImagesListFinal.size
                        Log.i("MainActivity", "${easyImagesListFinal}")
                        Log.i("MainActivity", "count: $count")
                    }
                }
            }
        return easyImagesListFinal
        }

    init {
        getEasyRandomImagesList()
    }

}
