package com.qa.flowcharts;

import com.qa.flowcharts.FlowChartOne;
import com.qa.flowcharts.FlowChartTwo;

public class Main {

	public static void main(String[] args) {
		
		FlowChartOne myFlowCharts = new FlowChartOne();
		myFlowCharts.flowCharts(2, 3, false);
		
		FlowChartTwo myFlowChartTwo = new FlowChartTwo();
		myFlowChartTwo.aEval(2700);

	}

}
