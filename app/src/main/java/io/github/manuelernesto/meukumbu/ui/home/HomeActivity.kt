package io.github.manuelernesto.meukumbu.ui.home

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target
import io.github.manuelernesto.meukumbu.R
import io.github.manuelernesto.meukumbu.util.CircleTransform
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.mk_settings.*

class HomeActivity : AppCompatActivity() {

    private lateinit var mNavController: NavController
    private val PROFILE_ICON_ID = 2020

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        mNavController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupWithNavController(toolbar, mNavController)
        NavigationUI.setupActionBarWithNavController(this, mNavController)
    }

    //
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(mNavController, null)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuI: MenuItem =
            menu!!.add(Menu.NONE, PROFILE_ICON_ID, Menu.NONE, "")

        val target = object : Target {
            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}

            override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}

            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                val mBitmapDrawable =
                    BitmapDrawable(resources, CircleTransform().getCroppedBitmap(bitmap!!))

                menuI.icon = mBitmapDrawable
            }
        }

        Picasso.get()
            .load(R.drawable.me)
            .into(target)
        menuI.setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_IF_ROOM)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            PROFILE_ICON_ID -> settings()
        }
        return super.onOptionsItemSelected(item)
    }


    private fun settings() {
        val mBottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
        val dialogLayout = layoutInflater.inflate(R.layout.mk_settings, null)
        mBottomSheetDialog.setContentView(dialogLayout)
        mBottomSheetDialog.setCancelable(true)
        mBottomSheetDialog.show()

//
//        val header = dialogLayout.findViewById<TextView>(R.id.rating_header_tv)
//
//        val btnSair = dialogLayout.findViewById<Button>(R.id.cancel_btn_pontos)
//        val btnShare = dialogLayout.findViewById<Button>(R.id.share_btn_ideia)
//
//        val txt = dialogLayout.findViewById<EditText>(R.id.ideia_share_txt)
//        val process = dialogLayout.findViewById<ProgressBar>(R.id.progressBarRating)


//        btnSair.setOnClickListener {
//            mBottomSheetDialog.dismiss()
//        }


    }
}