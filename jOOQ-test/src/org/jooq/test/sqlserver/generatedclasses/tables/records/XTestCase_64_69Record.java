/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -315829508;

	/**
	 * The table column <code>dbo.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * The table column <code>dbo.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * The table column <code>dbo.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 *
	 * @deprecated [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	@Deprecated
	public java.util.List<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID)))
			.fetch();
	}

	/**
	 * The table column <code>dbo.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES dbo.x_unused (id)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * The table column <code>dbo.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES dbo.x_unused (id)
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	/**
	 * @deprecated - [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	public void setUnusedId(org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value.getValue(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID));
		}
	}

	/**
	 * The table column <code>dbo.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES dbo.x_unused (id)
	 * </pre></code>
	 *
	 * @deprecated [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	@Deprecated
	public org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
