package com.pgs.sample;

public class OperationResult {

	private Integer result;
	private OperationType operation;

	public OperationResult(Integer result, OperationType operation) {
		this.result = result;
		this.operation = operation;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
	public OperationType getOperation() {
		return operation;
	}
	
	public void setOperation(OperationType operation) {
		this.operation = operation;
	}	
	
}
