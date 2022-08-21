package cn.edu.glmc.service;

import cn.edu.glmc.bean.Hc;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:25
 */
public interface HcBatchService {
    List<Hc> excelToList(InputStream inputStream);

    int readExcelValueRows(Sheet sheet, int start);

    Boolean isCellEmpty(Row row);

    String getValues(Cell cell);
}
