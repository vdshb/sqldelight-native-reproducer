package integration

import com.example.createDriver
import kotlin.test.Test

class SqlDelightDriverFactoryTest {

    @Test
    fun test() {
        val driver = createDriver("/tmp/_sqldelight_test_db.db")
    }

}