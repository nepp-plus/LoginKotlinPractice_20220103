package com.neppplus.loginkotlinpractice_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼이 눌리면 할 일

//        1. 입력한 아이디와 비번이 뭔지 변수에 담아두자.

//        2. id : admin / pw : qwer1234 두개가 모두 맞다면, 토스트로 "관리자입니다."
//          => 둘중 하나라도 틀리다면 "로그인 실패." 토스트.

    }
}