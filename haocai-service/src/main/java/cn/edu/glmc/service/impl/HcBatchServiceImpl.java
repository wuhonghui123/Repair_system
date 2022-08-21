package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Hc;
import cn.edu.glmc.service.HcBatchService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:26
 */
public class HcBatchServiceImpl implements HcBatchService {

    @Override
    public List<Hc> excelToList(InputStream inputStream) {
        return null;
    }

    @Override
    public int readExcelValueRows(Sheet sheet, int start) {
        return 0;
    }

    @Override
    public Boolean isCellEmpty(Row row) {
        return null;
    }

    @Override
    public String getValues(Cell cell) {
        return null;
    }
}
