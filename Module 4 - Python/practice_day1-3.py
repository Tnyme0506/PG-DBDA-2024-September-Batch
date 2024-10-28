class BankAccount:
    def __init__(self,account_number,account_name,balance):
        self.account_number = account_number
        self.account_name = account_name
        self.balance = balance
    

    def withdraw(self,amount):
        self.balance = self.balance - amount
        print(f"Balance is {self.balance}")
    
    def deposit(self, amount):
        self.balance = self.balance + amount
        print("Balance is: {0}".format(self.balance))


acct1 = BankAccount(101,"Tony",50000)
print("Account Number:",acct1.account_number)
print("Account Name:",acct1.account_name)
print("Current balance is:",acct1.balance)
acct1.withdraw(5000)
acct1.deposit(10000)

print("------------------------------------------------")
l1=list()
l1.append(101)
l1.append("Tony")
l1.append("banana")
print(l1)
l1.pop(0)
print(l1)
l1.sort()
print(l1)
l1.reverse()
print(l1)
 
