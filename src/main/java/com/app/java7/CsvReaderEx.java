package com.app.java7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.codehaus.plexus.interpolation.PrefixedPropertiesValueSource;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CsvReaderEx {

	public static void main(String[] args) throws Exception {

		String fileName = "F:\\Narasimha\\ALKURAIMI\\Sample of Files from T24\\Proprietory Card Extract_20201228_0001_YE0012003 (1).csv";

		FileReader filereader = new FileReader(fileName);

		// create csvParser object with
		// custom seperator semi-colon
		CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

		// create csvReader object with parameter
		// filereader and parser
		// com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader)
		// .withCSVParser(parser)
		// .build();
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		// Read all data at once
		List<String[]> allData = csvReader.readAll();

		ProprietaryDTO prop = new ProprietaryDTO();

		// Print Data.
		for (String[] row : allData) {
			System.out.println(row[22]);
			for (String cell : row) {
				System.out.print(cell + "\t");

				String data[] = cell.split(",");

				prop.setBatchid(data[0]);
				prop.setBulkRefId(data[1]);

				System.out.println(prop);

			}
			System.out.println();
		}
	}

}
