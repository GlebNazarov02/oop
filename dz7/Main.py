from Meals import *
from Drinks import *
from VendingMachine import *

vendingm = VendingMachine()

pr1 = Meals("Chips",40,5.5)
pr2 = Drinks("Cola",36,4.5)
vendingm.addProd(pr1)
vendingm.addProd(pr2)
vendingm.printVendingMachine()
vendingm.searchProd("Cola")