package com.example.learningcoroutine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Printed second
//        GlobalScope.launch{
//            //Similar to Thread.sleep but sleeps only this coroutine.
////            delay(5000L)
////            Log.d(TAG, "Coroutine says hello from thread ${Thread.currentThread().name}")
//
//            val netWorkCallAnswer = doNetworkCall()
//            val netWorkCallAnswer2 = doNetworkCall2()
//
//            //it will take six seconds to print both, because the 3 seconds of
//            //each suspended function will add up
//            Log.d(TAG, netWorkCallAnswer)
//            Log.d(TAG, netWorkCallAnswer2)
//        }

//        GlobalScope.launch(Dispatchers.IO) {
//            Log.d(TAG, "Starting coroutine in thread ${Thread.currentThread().name}")
//            val answer = doNetworkCall()
//
//            //Change the context of this coroutine
//            //In this case, I'm switching to the Main thread to update the UI
//            withContext(Dispatchers.Main){
//                Log.d(TAG, "Setting text in thread ${Thread.currentThread().name}")
//                //The code below will be executed in the Main thread
//                tvNetworkResponse.text = answer
//            }
//        }

        //Printed first
//        Log.d(TAG, "Hello from thread ${Thread.currentThread().name}")

//        Log.d(TAG, "Before runBlocking")
//
//        //Start a new coroutine, but blocks the main thread
//        runBlocking {
//            launch(Dispatchers.IO) {
//                delay(3000L)
//                Log.d(TAG, "Finished IO coroutine 1")
//            }
//            launch(Dispatchers.IO) {
//                delay(3000L)
//                Log.d(TAG, "Finished IO coroutine 2")
//            }
//
//            Log.d(TAG, "Start of runBlocking")
//            delay(5000L)
//            Log.d(TAG, "End of runBlocking")
//        }
//        Log.d(TAG, "After runBlocking")

//        val job = GlobalScope.launch(Dispatchers.Default) {
////            repeat(5){
////                Log.d(TAG, "Coroutine is still working...")
////                delay(1000L)
////            }
//            Log.d(TAG, "Starting long running calculation")
//            //Automatically cancel the function if it takes more than 3s to execute
//            withTimeout(3000L){
//                for(i in 30..40){
//                    if(isActive){
//                        Log.d(TAG, "Result for i = $i: ${fib(i)}")
//                    }
//                }
//            }
//
//            Log.d(TAG, "Ending long running calculation")
//        }

//        runBlocking {
//            //Wait for the job to finish
////            job.join()
//
//            delay(2000L)
//            job.cancel()
//            Log.d(TAG, "Canceled job!")
//        }

//        GlobalScope.launch(Dispatchers.IO) {
//            val time = measureTimeMillis {
//                val answer1 = async { doNetworkCall() }
//                val answer2 = async { doNetworkCall2() }
//
//                Log.d(TAG, "Answer1: ${answer1.await()}")
//                Log.d(TAG, "Answer2: ${answer2.await()}")
//            }
//            Log.d(TAG, "$time")
//        }
//        btnStartActivity.setOnClickListener {
//            //This coroutine will only last until this activity is destroyed
//            lifecycleScope.launch {
//                while (true){
//                    delay(1000L)
//                    Log.d(TAG, "Still running...")
//                }
//            }
//
//            //This coroutine will continue even after this activity is destroyed
//            //May lead to memory leak
//            GlobalScope.launch {
//                delay(5000L)
//                Intent(this@MainActivity, SecondActivity::class.java).also{
//                    startActivity(it)
//                    finish()
//                }
//            }
//        }


    }

//    fun fib(n: Int): Long{
//        return if(n == 0) 0
//        else if (n == 1) 1
//        else fib(n - 1) + fib(n - 2)
//    }

//    suspend fun doNetworkCall(): String{
//        delay(3000L)
//        return "This is the answer"
//    }
//
//    suspend fun doNetworkCall2(): String{
//        delay(3000L)
//        return "This is the second answer"
//    }
}