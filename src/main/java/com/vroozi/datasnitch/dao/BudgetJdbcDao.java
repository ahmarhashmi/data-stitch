package com.vroozi.datasnitch.dao;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public interface BudgetJdbcDao {

  void insertBudget(Pair<String, List<Object>> pair, String qMarks,
      String tableName);
}
