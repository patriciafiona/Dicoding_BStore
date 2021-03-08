package com.path_studio.bstore.Activities

import PreferencesManager
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.paolorotolo.appintro.AppIntro
import com.github.paolorotolo.appintro.AppIntro2Fragment
import com.github.paolorotolo.appintro.model.SliderPagerBuilder
import com.path_studio.bstore.R

class IntoActivity : AppIntro() {
    private lateinit var manager: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        manager = PreferencesManager(this)

        if (manager.isFirstRun()) {
            showIntroSlides()
        } else {
            goToMain()
        }
    }

    private fun showIntroSlides() {
        manager.setFirstRun()
        val pageOne = SliderPagerBuilder()
            .title(getString(R.string.slide_one_top_text))
            .description(getString(R.string.slide_one_down_text))
            .imageDrawable(R.drawable.intro_01_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        val pageTwo = SliderPagerBuilder()
            .title(getString(R.string.slide_two_top_text))
            .description(getString(R.string.slide_two_down_text))
            .imageDrawable(R.drawable.intro_02_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        val pageThree = SliderPagerBuilder()
            .title(getString(R.string.slide_three_top_text))
            .description(getString(R.string.slide_three_down_text))
            .imageDrawable(R.drawable.intro_03_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        val pageFour = SliderPagerBuilder()
            .title(getString(R.string.slide_four_top_text))
            .description(getString(R.string.slide_four_down_text))
            .imageDrawable(R.drawable.intro_04_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        val pageFive = SliderPagerBuilder()
            .title(getString(R.string.slide_five_top_text))
            .description(getString(R.string.slide_five_down_text))
            .imageDrawable(R.drawable.intro_05_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        val pageFinal = SliderPagerBuilder()
            .title(getString(R.string.slide_final_top_text))
            .description(getString(R.string.slide_final_down_text))
            .imageDrawable(R.drawable.intro_06_s)
            .bgColor(getColor(R.color.white))
            .titleColor(R.color.grey_900)
            .descColor(R.color.grey_800)
            .build()

        addSlide(AppIntro2Fragment.newInstance(pageOne))
        addSlide(AppIntro2Fragment.newInstance(pageTwo))
        addSlide(AppIntro2Fragment.newInstance(pageThree))
        addSlide(AppIntro2Fragment.newInstance(pageFour))
        addSlide(AppIntro2Fragment.newInstance(pageFive))
        addSlide(AppIntro2Fragment.newInstance(pageFinal))

        setFadeAnimation()

        // Change Indicator, DOne Text, Skip, and Next Arrow Color
        setIndicatorColor(R.color.grey_800, R.color.grey_600)
        //setColorDoneText(this.getColor(R.color.grey_800))
        //setColorSkipButton(this.getColor(R.color.grey_800))
        setNextArrowColor(this.getColor(R.color.grey_800))
    }

    private fun goToMain() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        goToMain()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        goToMain()
    }
}