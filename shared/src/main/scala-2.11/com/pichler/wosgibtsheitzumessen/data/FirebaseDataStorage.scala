package com.pichler.wosgibtsheitzumessen.data

import java.io.FileInputStream
import java.nio.file.{Files, Paths}

import com.google.firebase.database._
import com.google.firebase.{FirebaseApp, FirebaseOptions}

/**
  * Created by Patrick on 21.09.2016.
  */
object FirebaseDataStorage {
  val firebaseApp = {
    val firebaseOptions = new FirebaseOptions.Builder()
      .setServiceAccount(new FileInputStream(Paths.get("..", "credentials", "firebase-auth.json").toFile))
      .setDatabaseUrl("https://wosgibtsheitzumessen.firebaseio.com/")
      .build()

    FirebaseApp.initializeApp(firebaseOptions)
  }

  val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()

  firebaseDatabase.getReference("test").addValueEventListener(new ValueEventListener {
    override def onDataChange(dataSnapshot: DataSnapshot): Unit = {}
    override def onCancelled(databaseError: DatabaseError): Unit = {}
  })

}
