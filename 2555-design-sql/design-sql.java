import java.util.*;

public class SQL {
    private Map<String, List<List<String>>> db = new HashMap<>();

    public SQL(List<String> names, List<Integer> columns) {
        // Possibly initialize the database based on table names and column counts here.
        // For example, you can iterate through 'names' and create empty tables in 'db'.
    }

    public void insertRow(String name, List<String> row) {
        db.computeIfAbsent(name, k -> new ArrayList<>()).add(row);
    }

    public void deleteRow(String name, int rowId) {
        // Implement the deleteRow method as needed.
        // You can remove a specific row from a table using db.get(name).remove(rowId - 1);
    }

    public String selectCell(String name, int rowId, int columnId) {
        List<List<String>> table = db.get(name);
        if (table != null && rowId >= 1 && rowId <= table.size()) {
            List<String> row = table.get(rowId - 1);
            if (columnId >= 1 && columnId <= row.size()) {
                return row.get(columnId - 1);
            }
        }
        return ""; // Return an empty string if cell doesn't exist or indices are out of bounds.
    }
}


/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * obj.insertRow(name,row);
 * obj.deleteRow(name,rowId);
 * String param_3 = obj.selectCell(name,rowId,columnId);
 */