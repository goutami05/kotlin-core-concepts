class BankAccount {
    private var balance: Double = 0.0
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Successfully deposited \$$amount. Current balance: \$$balance")
        } else {
            println("Invalid deposit amount.")
        }
    }
}
fun main() {
    val account = BankAccount()
    account.deposit(250.50)
}
