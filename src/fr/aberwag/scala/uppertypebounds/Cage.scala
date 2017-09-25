package fr.aberwag.scala.uppertypebounds

class Cage[P<:Pet](p:P) {
  def pet : P = p
}