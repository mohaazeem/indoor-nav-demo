class CreateNodes < ActiveRecord::Migration
  def change
    create_table :nodes do |t|
      t.string :label
      t.float :x
      t.float :y
      t.integer :type
      t.references :graph, index: true, foreign_key: true

      t.timestamps null: false
    end
  end
end
