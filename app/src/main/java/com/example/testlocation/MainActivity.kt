package com.example.testlocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var et_user_name: EditText
    private lateinit var et_password: EditText
    private lateinit var btn_submit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_user_name = findViewById(R.id.et_user_name)

        et_password = findViewById(R.id.et_password)
        btn_submit = findViewById(R.id.btn_submit)


        //  fun init() {
        //   et_user_name = findViewById(R.id.et_user_name)
        //    et_password = findViewById(R.id.et_password)
        //    btn_submit = findViewById(R.id.btn_submit)
        // txt_register = findViewById(R.id.txt_register)
        //  }
        //   fun showToast(message:String)
        //  {
        //      Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        //   }


        btn_submit.setOnClickListener {

            val intent = Intent(this, Location::class.java)




            startActivity(intent)
        }


        //   btn_submit.setOnClickListener {
        //             startActivity(Intent(this,Location::class.java))
        //          finish()
        //       }

        //  fun loginUser() {
        //     if(et_user_name.text.trim().toString().isEmpty())
        //      {
        //     et_user_name.error="Please Enter Email"
        //     et_user_name.requestFocus()
        //  return
        //  }
        //  if (!Patterns.EMAIL_ADDRESS.matcher(et_user_name.text.toString()).matches())
        //  {
        //       et_user_name.error="Please Enter Email"
        //      et_user_name.requestFocus()
        //      return
        //   }
        //   if (et_password.text.trim().toString().isEmpty())
        // {
        //  et_password.error = "Please Enter Password"
        //  et_password.requestFocus()
        //  return
        //   }
        //  if (et_password.length() < 6) {
        //    et_password.error = "Password required Minimum 6 Characters"
        //   et_password.requestFocus()
        //  return
        //  }
        //   auth.signInWithEmailAndPassword(et_user_name.text.toString(), et_password.text.toString()).addOnCompleteListener(this)
        //  { task ->
        //      if (task.isSuccessful)
        //     {
        //          val auth
        //          val user = auth.currentUser
        //          if (user!!.isEmailVerified)
        //          {
        //  startActivity(Intent(this, Location::class.java))
        //  Toast.makeText(this, "Login Successfully.", Toast.LENGTH_SHORT).show()
        // finish()
        // }
        //         else
        //        {
        //            user.sendEmailVerification()
        //            Toast.makeText(this, "Verification mail sent Please verify .",Toast.LENGTH_SHORT).show()
        //        }
        //   }
        //     else
//       //     }
        // }

        //   public override fun onStart() {
        //     super.onStart()
        //     val currentUser:FirebaseUser? = auth.currentUser
        //     if(currentUser != null){
        //       if (currentUser.isEmailVerified) {
        //        startActivity(Intent(this, Location::class.java))
        //      finish()
        //     }
        //   }
        //  }
        //  }

    }
}

