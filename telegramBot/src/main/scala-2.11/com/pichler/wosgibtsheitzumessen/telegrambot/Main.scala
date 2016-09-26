package com.pichler.wosgibtsheitzumessen.telegrambot

import com.pichler.wosgibtsheitzumessen.telegrambot.bot.WosGibtsHeitZumEssenBot
import com.pichler.wosgibtsheitzumessen.telegrambot.reminder.ReminderChatDataStore

/**
  * Created by Patrick on 23.09.2016.
  */
object Main extends App {
  WosGibtsHeitZumEssenBot.start()
  ReminderChatDataStore.start()
}

