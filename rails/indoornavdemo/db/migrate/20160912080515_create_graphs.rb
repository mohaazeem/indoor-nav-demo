class CreateGraphs < ActiveRecord::Migration
  def change
    create_table :graphs do |t|
      t.string :json_string

      t.timestamps null: false
    end
  end
end
