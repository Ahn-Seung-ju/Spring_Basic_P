package DI_Spring04;

import java.util.List;

public class ProtocolHandler_P {
	private List<MyFilter_P> filters;
	
	public List<MyFilter_P> getFilters(){
		
		return this.filters;
	}
	
	public void setFilters(List<MyFilter_P> filters) {
		this.filters = filters;
		
	}
	
	public int filters_length() {
		return this.filters.size();
	}
}
