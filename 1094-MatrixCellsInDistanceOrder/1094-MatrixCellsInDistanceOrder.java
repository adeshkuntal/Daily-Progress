// Last updated: 8/4/2025, 6:52:12 PM
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> cells = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells.add(new int[] {r, c});
            }
        }
        cells.sort(Comparator.comparingInt(cell -> Math.abs(cell[0] - rCenter) + Math.abs(cell[1] - cCenter)));
        return cells.toArray(new int[cells.size()][]);
    }
}