from abc import ABC, abstractmethod


class Prod(ABC):
    @abstractmethod
    def getName(self):
        pass

    @abstractmethod
    def setName(self, name):
        pass

    @abstractmethod
    def getCost(self):
        pass

    @abstractmethod
    def setCost(self, cost):
        pass
