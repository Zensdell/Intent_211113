package com.nepplus.intent_211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)


        btnOk.setOnClickListener {

//            1. 입력한 값을 변수에 저장
            val inputNickname = edtNickname.text.toString()

//            2. 새 닉네임을 들고 복귀 얘는 put으로 nick이름표이 edittext를 저장

            val resulutIntent = Intent()
            resulutIntent.putExtra("nick", inputNickname)

//            3. 결과 설정 - OK 누른게 맞다고 구별, 들고갈 데이터  resulutIntent 통째로 들고 돌아가라

            setResult(RESULT_OK,resulutIntent)

//            4. 실제 복귀
            finish()


        }


    }
}