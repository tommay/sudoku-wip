package net.tommay.sudoku

case class Next( 
  tjpe: Heuristic.Value,
  placement: Placement,
  cells: Iterable[Int])
