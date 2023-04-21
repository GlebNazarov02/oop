from Meals import *
from Drinks import *
from Prod import *

class VendingMachine:

    def __init__(self):
        self.__VendingMachine = []

    def printVendingMachine(self):
        for i in self.__VendingMachine:
            print(i)

    def searchProd(self,thename):
        for i in self.__VendingMachine:
            if i.getName() is thename:
                print(i)

    def addProd(self, prod):
        self.__VendingMachine.append(prod)
    
    def delProd(self,prod):
        self.__VendingMachine.remove(prod)