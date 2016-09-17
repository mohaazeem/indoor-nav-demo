class Graph < ActiveRecord::Base
  has_many :nodes
  has_many :edges

  validates :json_string, presence: true
end
