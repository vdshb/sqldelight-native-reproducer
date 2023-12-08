package com.example

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import java.util.*

actual fun createDriver(filePath: String): SqlDriver {
    val jdbcUrl = "jdbc:sqlite:${filePath}"
    val driver: SqlDriver = JdbcSqliteDriver(
        url = jdbcUrl,
        properties = Properties().apply { put("foreign_keys", false.toString()) }
    )
    return driver
}