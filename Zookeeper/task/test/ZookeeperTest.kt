import org.hyperskill.hstest.dynamic.DynamicTest
import org.hyperskill.hstest.stage.StageTest
import org.hyperskill.hstest.testcase.CheckResult
import org.hyperskill.hstest.testing.TestedProgram

class ZookeeperTest : StageTest<String>() {

    private val correctOutput = """
        I love animals!
        Let's check on the animals...
        The deer looks fine.
        The bat looks happy.
        The lion looks healthy.
        """.trimIndent()

    @DynamicTest
    fun test(): CheckResult {
        val testedProgram = TestedProgram();
        val output = testedProgram.start().trim();

        if (output != correctOutput) {
            return CheckResult.wrong("Your output should be like in the example!");
        }

        return CheckResult.correct()
    }
}