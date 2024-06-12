object Main extends App {
  printLogo()

  val juca = new Person("Juca Amaro",45)
  val jucaAccount = new Account("123", juca)
  var accounts = List[Account]()
  accounts = accounts :+ jucaAccount
  val transaction = new Transaction(5,jucaAccount)

  getAccountScreen(accounts)

}

def getAccountScreen(accounts: List[Account]) : Unit = {
  println("Please type the account number:")
  val accountNumber = scala.io.StdIn.readLine()

  var account = findAccount(accountNumber, accounts)

  if (account.isEmpty) {
    println("Account number not found")
    return
  }

  println("This account belongs to: " + account.get.person.name)
}

def findAccount(accountNumber:String, accounts:List[Account]): Option[Account] = {
  accounts.find(account => accountNumber == account.number)
}

def printLogo(): Unit = {
  println("\n######## ##     ## ########     #######    #####    ######     ########     ###    ##    ## ##    ##")
  println("   ##    ##     ## ##          ##     ##  ##   ##  ##    ##    ##     ##   ## ##   ###   ## ##   ## ")
  println("   ##    ##     ## ##          ##     ## ##     ## ##          ##     ##  ##   ##  ####  ## ##  ##  ")
  println("   ##    ######### ######       ######## ##     ##  ######     ########  ##     ## ## ## ## #####   ")
  println("   ##    ##     ## ##                 ## ##     ##       ##    ##     ## ######### ##  #### ##  ##  ")
  println("   ##    ##     ## ##          ##     ##  ##   ##  ##    ##    ##     ## ##     ## ##   ### ##   ## ")
  println("   ##    ##     ## ########     #######    #####    ######     ########  ##     ## ##    ## ##    ##\n")
}