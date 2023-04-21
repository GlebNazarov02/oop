from Prod import Prod

class Drinks(Prod):
    def __init__(self,name,cost,volume):
        self.__name = name
        self.__cost = cost
        self.__volume = volume

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name
    
    def getCost(self):
        return self.__cost

    def setCost(self, cost):
        self.__cost = cost
         
    def getVolume(self):
        return self.__volume

    def setVolume(self, volume):
        self.__volume = volume

    def __str__(self):
        return f"name:{self.__name} cost:{self.__cost} volume:{self.__volume}"
