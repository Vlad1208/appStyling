package com.candorgrc.idfusion.sandbox.client.datapresentation;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
/**
 * Base Async Cell List class providing the means for low-level & fast rendering
 * of a {@link CellList} collection.
 * 
 * @param <T>
 *            {@link AsyncDataProvider}
 * 
 * @author bp
 *
 */
public abstract class AsyncCellList<T> extends CellList<T> {

	/* async data source */
	private AsyncDataProvider<T> dataProvider;

	/* # of items to be fetch per request/offset/page; [1, 100] */
	private final int rangeSize;

	/* current page number; 0 based */
	private int offset = 0;

	/**
	 * Construct a new {@link AsyncCellList}.
	 * 
	 * @param cell
	 * @param resources
	 * @param dataProvider
	 * @param rangeSize
	 */
	protected AsyncCellList(final Cell<T> cell, Resources resources, AsyncDataProvider<T> dataProvider, int rangeSize) {
		super(cell, resources);
		if (dataProvider != null) {
			setDataProvider(dataProvider);
		}
		this.rangeSize = rangeSize;
		initComponents(rangeSize);
	}

	/**
	 * Do components initialization.
	 * 
	 * @param pageSize
	 */
	private void initComponents(int pageSize) {
		// set page size
		setPageSize(pageSize);
	}

	/**
	 * Get {@link AsyncCellList#dataProvider}.
	 * 
	 * @return {@link AsyncDataProvider}
	 */
	protected AsyncDataProvider<T> getDataProvider() {
		return dataProvider;
	}

	/**
	 * Sets {@link AsyncDataProvider#dataProvider} and binds it with this data
	 * display; i.e. {@link CellList}.
	 * 
	 * @param dataProvider
	 */
	protected void setDataProvider(AsyncDataProvider<T> dataProvider) {
		// set dataProvider
		this.dataProvider = dataProvider;
		// connect the CellList to the data provider
		dataProvider.addDataDisplay(this);
	}

	/**
	 * Get {@link AsyncCellList#offset}.
	 * 
	 * @return {@link AsyncCellList#offset}
	 */
	protected int getOffset() {
		return offset;
	}

	/**
	 * Set {@link AsyncCellList#offset}.
	 * 
	 * @param offset
	 */
	protected void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Increments {@link AsyncCellList#offset} by 1.
	 * 
	 */
	protected void incrementOffset() {
		offset++;
	}

	/**
	 * Get {@link AsyncCellList#rangeSize}.
	 * 
	 * @return {@link AsyncCellList#rangeSize}
	 */
	protected int getRangeSize() {
		return rangeSize;
	}

	/**
	 * Set the visible {@link Range} to <em>first/0</em>, clear presenter data,
	 * fire a {@link RangeChangeEvent} that will be handled by
	 * {@link #refreshData()} and reset offset.
	 */
	public void resetVisibleRangeAndClearData() {
		// reset offset
		setOffset(0);

		// reset visible {@link Range} and clear presenter data
		setVisibleRangeAndClearData(new Range(0, getRangeSize()), true);
	}

	/**
	 * Triggers onRangeChanged in order to fetch a new chunk/page of {@link T}
	 * items and append it to the existing stream.
	 */
	public void nextRange() {
		final int rowsToAppend = isRowCountExact() ? 0 : getRangeSize();
		//@formatter:off
		final int rangeLength = Math.min(getVisibleRange().getLength() + getRangeSize(), 
										 getRowCount() + rowsToAppend);//@formatter:on
		setVisibleRange(getVisibleRange().getStart(), rangeLength);
	}

}
