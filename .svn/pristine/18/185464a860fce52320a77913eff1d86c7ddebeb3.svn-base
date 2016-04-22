package org.kemsa.kws.data;

import java.util.List;

public interface HCRUD<T> {
	public void create(T t);

	public T retrieveById(Class<T> type, long id);

	public List<T> retrieveAll(Class<T> type);
	
	public List<T> retrieveByOwner(Class<T> type, Long c_bpartner_id);
	
	public List<T> retrieveByOrder(Class<T> type, Long c_order_id);

	public T retrieveByName(Class<T> type, String name);

	public T retrieveByCode(Class<T> type, String code);

	public T retrieveByDocNo(Class<T> type, String documentno);

	public T retrieveByExtNo(Class<T> type, String externalno);

	public void delete(T t);

}
