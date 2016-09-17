class CreateEdges < ActiveRecord::Migration
  def change
    create_table :edges do |t|
      t.references :start_node, index: true, foreign_key: true
      t.references :end_node, index: true, foreign_key: true
      t.float :distance
      t.references :graph, index: true, foreign_key: true

      t.timestamps null: false
    end
  end
end
