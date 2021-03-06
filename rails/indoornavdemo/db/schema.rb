# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20160912080904) do

  create_table "edges", force: :cascade do |t|
    t.integer  "start_node_id"
    t.integer  "end_node_id"
    t.float    "distance"
    t.integer  "graph_id"
    t.datetime "created_at",    null: false
    t.datetime "updated_at",    null: false
  end

  add_index "edges", ["end_node_id"], name: "index_edges_on_end_node_id"
  add_index "edges", ["graph_id"], name: "index_edges_on_graph_id"
  add_index "edges", ["start_node_id"], name: "index_edges_on_start_node_id"

  create_table "graphs", force: :cascade do |t|
    t.string   "json_string"
    t.datetime "created_at",  null: false
    t.datetime "updated_at",  null: false
  end

  create_table "nodes", force: :cascade do |t|
    t.string   "label"
    t.float    "x"
    t.float    "y"
    t.integer  "type"
    t.integer  "graph_id"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
  end

  add_index "nodes", ["graph_id"], name: "index_nodes_on_graph_id"

end
